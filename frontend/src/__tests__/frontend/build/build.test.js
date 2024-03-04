// ********RoostGPT********
// Test generated by RoostGPT for test ReactTesting123 using AI Type Open AI and AI Model gpt-4-1106-preview



// ********RoostGPT********
import React from 'react';
import { shallow } from 'enzyme'; // Assuming Enzyme is used for rendering
import Hello from '../../../src/i18n/Hello';

describe('Hello Component', () => {
  let wrapper;

  beforeEach(() => {
    // Default Render of Hello without passing props
    wrapper = shallow(<Hello />);
  });

  test('renders without crashing', () => {
    expect(wrapper).toBeDefined();
  });

  test('displays default greeting when no name prop is provided', () => {
    expect(wrapper.text()).toContain('Hello, World!');
  });

  test('displays personalized greeting when name prop is provided', () => {
    // We provide a "name" prop to Hello
    wrapper = shallow(<Hello name="Jane" />);
    expect(wrapper.text()).toContain('Hello, Jane!');
  });

  // Add more test cases as needed...
});

